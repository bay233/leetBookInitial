package data;


import java.util.*;

public class Twitter {

    // 用户对应发送的tweet {userId: [tweetId, time]}
    Map<Integer, List<Integer[]>> allTweet = new HashMap<>();

    // 用户的关注列表
    Map<Integer, Set<Integer>> allFollow = new HashMap<>();

    int time = 0;

    public Twitter() {}

    public void postTweet(int userId, int tweetId) {
        if (allTweet.get(userId) == null){
            List<Integer[]> tweetList = new LinkedList<>();
            tweetList.add(new Integer[]{tweetId, time++});
            allTweet.put(userId, tweetList);
        }else{
            List<Integer[]> tweetList = allTweet.get(userId);
            tweetList.add(new Integer[]{tweetId, time++});
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Integer[]> newsFeedQueue = new PriorityQueue<>((o1, o2)->{
            return o2[1] - o1[1];
        });
        addFeed(newsFeedQueue, allTweet.get(userId));
        if (allFollow.get(userId) != null){
            for (Integer followUserId: allFollow.get(userId)){
                addFeed(newsFeedQueue, allTweet.get(followUserId));
            }
        }

        List<Integer> res = new ArrayList<>();
        int count = 0;
        while (newsFeedQueue.size() > 0&& count++ < 10){
            res.add(newsFeedQueue.poll()[0]);
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) {return;}
        if (allFollow.get(followerId) == null){
            Set<Integer> followList = new HashSet<>();
            followList.add(followeeId);
            allFollow.put(followerId, followList);
        }else{
            Set<Integer> followList = allFollow.get(followerId);
            followList.add(followeeId);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId) {return;}
        if (allFollow.get(followerId) == null){
            return ;
        }
        Iterator<Integer> iter = allFollow.get(followerId).iterator();
        while (iter.hasNext()){
            if (iter.next() == followeeId){
                iter.remove();
                break;
            }
        }
    }

    private void addFeed(Queue<Integer[]> queue, List<Integer[]> list){
        if (list == null || list.isEmpty()) {return;}
        for (int i = list.size() - 1, j = 0; i >= 0 && j < 10; --i, ++j){
            queue.add(list.get(i));
        }
    }

    public static void main(String[] args) {
        Twitter t = new Twitter();
        t.postTweet(1, 5);
        System.out.println(t.getNewsFeed(1));

        PriorityQueue<Integer> q = new PriorityQueue<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            q.add(r.nextInt(100));
        }

        Iterator<Integer> iter = q.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}

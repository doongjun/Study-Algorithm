package test;

import java.util.*;

public class Hash3 {
    public static void main(String[] args) {
        class Solution {

            class Music{
                String genre;
                int play;
                int idx;

                public Music(String genre, int play, int idx) {
                    this.genre = genre;
                    this.play = play;
                    this.idx = idx;
                }
            }

            public ArrayList<Music> pick(String genre, String[] genres, int[] plays) {
                ArrayList<Music> result = new ArrayList<>();
                ArrayList<Music> list = new ArrayList<>();
                for(int i=0; i<genres.length; i++) {
                    if(genres[i].equals(genre)) {
                        list.add(new Music(genre, plays[i], i));
                    }
                }
                Collections.sort(list, (o1, o2) -> o2.play - o1.play);
                result.add(list.get(0));
                if(list.size()!=1){
                    result.add(list.get(1));
                }
                return result;
            }

            public int[] solution(String[] genres, int[] plays) {
                ArrayList<Integer> tmp = new ArrayList<>();
                HashMap<String, Integer> map = new HashMap<>();
                for(int i=0; i<genres.length; i++) {
                    map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
                }

                while(!map.isEmpty()) {
                    int max = -1;
                    String maxKey = "";
                    for(String key : map.keySet()) {
                        if(map.get(key) > max) {
                            maxKey = key;
                            max = map.get(key);
                        }
                    }
                    ArrayList<Music> playList = pick(maxKey, genres, plays);
                    for(Music music : playList) {
                        tmp.add(music.idx);
                    }
                    map.remove(maxKey);
                }
                int[] answer = new int[tmp.size()];
                for(int i=0; i<answer.length; i++) {
                    answer[i] = tmp.get(i);
                }

                return answer;
            }
        }
        Solution solution = new Solution();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        solution.solution(genres, plays);
    }
}

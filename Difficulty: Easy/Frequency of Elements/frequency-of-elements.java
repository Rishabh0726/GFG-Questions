class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int num : arr){
            if (!map.containsKey(num)){
                map.put(num, 1);
            }else {
                map.put(num, map.get(num)+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            list.add(temp);
        }
        return list;
    }
}
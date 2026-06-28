class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            int count = countMap.getOrDefault(num, 0);
            countMap.put(num, count + 1);
        }
        List<Integer> topKFrequentElements = new ArrayList<>();
        countMap.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey).forEach(topKFrequentElements::add);
        int[] array = topKFrequentElements.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }
}

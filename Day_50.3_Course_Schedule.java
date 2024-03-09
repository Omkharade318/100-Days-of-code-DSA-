class Solution {
    public boolean canFinish(final int numCourses, final int[][] prerequisites) {
        final List<Integer>[] adjacents = new List[numCourses];
        final int[] frequencies = new int[numCourses];
        int count = 0;

        for(final int[] prerequisite : prerequisites) {
            if(adjacents[prerequisite[0]] == null)
                adjacents[prerequisite[0]] = new ArrayList<>();

            adjacents[prerequisite[0]].add(prerequisite[1]);
            frequencies[prerequisite[1]]++;
        }

        final Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < adjacents.length; i++) {
            if(frequencies[i] == 0) {
                queue.offer(i);
                count++;
            }
        }

        while(!queue.isEmpty()) {
            final int i = queue.poll();

            for(int j = 0; adjacents[i] != null && j < adjacents[i].size(); ++j) {
                final int p = adjacents[i].get(j);

                frequencies[p]--;

                if(frequencies[p] == 0) {
                    count++;
                    queue.offer(p);
                }
            }
        }

        return count == numCourses;
    }
}

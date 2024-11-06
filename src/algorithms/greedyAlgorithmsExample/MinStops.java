package algorithms.greedyAlgorithmsExample;

public class MinStops {

    private static int minStops(int[] stations, int capacity) {
        int result = 0; // optimal number of stops
        int currentStop = 0;

        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;

            while (nextStop < (stations.length -1) && stations[nextStop + 1] - stations[currentStop] <= capacity) {
                nextStop++;
            }

            if (currentStop == nextStop) {
                return -1;
            }
            if (nextStop < stations.length - 1) {
                result++;
            }
            currentStop = nextStop;
        }
        return result;
    }
}

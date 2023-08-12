package apphooks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Coverage {
    private Map<String, Object> coverageData;

    public Coverage() {
        coverageData = new HashMap<>();
    }

    public void merge(Coverage other) {
        for (Map.Entry<String, Object> entry : other.coverageData.entrySet()) {
            String fileName = entry.getKey();
            Object oldData = coverageData.get(fileName);
            Object newData = entry.getValue();

            if (oldData == null) {
                coverageData.put(fileName, newData);
            } else {
                // Merge coverage data for the same file
                if (oldData instanceof Map && newData instanceof Map) {
                    Map<String, Object> oldCoverage = (Map<String, Object>) oldData;
                    Map<String, Object> newCoverage = (Map<String, Object>) newData;

                    for (Map.Entry<String, Object> coverageEntry : newCoverage.entrySet()) {
                        String key = coverageEntry.getKey();
                        Object value = coverageEntry.getValue();

                        if (oldCoverage.containsKey(key)) {
                            Object oldValue = oldCoverage.get(key);
                            if (oldValue instanceof List && value instanceof List) {
                                List<Integer> oldHits = (List<Integer>) oldValue;
                                List<Integer> newHits = (List<Integer>) value;

                                // Merge hit counts for the same line
                                for (int i = 0; i < oldHits.size() && i < newHits.size(); i++) {
                                    oldHits.set(i, oldHits.get(i) + newHits.get(i));
                                }
                            }
                        } else {
                            oldCoverage.put(key, value);
                        }
                    }
                }
            }
        }
    }
}

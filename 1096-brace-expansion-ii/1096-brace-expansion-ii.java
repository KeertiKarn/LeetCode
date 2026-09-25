class Solution {

    int index = 0;

    public List<String> braceExpansionII(String expression) {

        Set<String> result = parseExpression(expression);

        List<String> ans = new ArrayList<>(result);

        Collections.sort(ans);

        return ans;
    }

    // Handles UNION: a,b,c
    private Set<String> parseExpression(String s) {

        Set<String> result = parseTerm(s);

        while (index < s.length() && s.charAt(index) == ',') {

            index++; // skip ','

            Set<String> next = parseTerm(s);

            result.addAll(next);
        }

        return result;
    }

    // Handles CONCATENATION: abc, a{b,c}, {a,b}{c,d}
    private Set<String> parseTerm(String s) {

        Set<String> result = new HashSet<>();

        // Identity element for concatenation
        result.add("");

        while (index < s.length()
                && s.charAt(index) != ','
                && s.charAt(index) != '}') {

            Set<String> current = parseFactor(s);

            result = multiply(result, current);
        }

        return result;
    }

    // Handles one factor: letter OR {...}
    private Set<String> parseFactor(String s) {

        Set<String> result = new HashSet<>();

        if (s.charAt(index) == '{') {

            index++; // skip '{'

            result = parseExpression(s);

            index++; // skip '}'

        } else {

            result.add(String.valueOf(s.charAt(index)));

            index++;
        }

        return result;
    }

    // Cartesian product / concatenation
    private Set<String> multiply(Set<String> a, Set<String> b) {

        Set<String> result = new HashSet<>();

        for (String x : a) {
            for (String y : b) {
                result.add(x + y);
            }
        }

        return result;
    }
}
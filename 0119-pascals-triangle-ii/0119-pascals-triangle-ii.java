
class Solution {
    public List<Integer> getRow(int rowIndex) {
     
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        ans.add(list);
        if (rowIndex == 0) {
            return list;
        }

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(1);
        ans.add(list2);
        if (rowIndex == 1) {
            return list2;
        }

        for (int i = 1; i < rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            List<Integer> l = ans.get(i);

            for (int j = 0; j < l.size() - 1; j++) {
                temp.add(l.get(j) + l.get(j + 1));
            }
            temp.add(1);
            ans.add(temp);
        }

        List<Integer> ll = ans.get(rowIndex );
        return ll;
    } 
    }
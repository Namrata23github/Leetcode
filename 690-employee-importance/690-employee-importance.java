/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/


class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        HashMap <Integer, Employee> map = new HashMap();
        
       for(Employee e: employees) {
           map.put(e.id, e);
       }
        
        int imp = 0;
        
        Stack<Integer>  s = new Stack();
        s.push(id);
        
        while(!s.isEmpty()) {
            Integer i = s.pop();
            Employee e = map.get(i);
             imp = imp + e.importance;
            for(Integer ss: e.subordinates) {
                s.push(ss);
            }
        }
        
        return imp; 
    }
}
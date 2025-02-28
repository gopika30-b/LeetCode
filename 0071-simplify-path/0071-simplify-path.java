class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i<path.length(); i++){
            if (path.charAt(i) == '/') continue;
            StringBuilder temp = new StringBuilder();
            while (i < path.length() && path.charAt(i) != '/'){
                temp.append(path.charAt(i));
                i++;
            } 
            if(temp.toString().equals(".")) continue;
            if(temp.toString().equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }else stack.push(temp.toString());
        }
        StringBuilder str = new StringBuilder();
        for (String dir : stack) {
            str.append("/").append(dir);
        }
        return str.toString().length()==0?"/":str.toString();
    }
}
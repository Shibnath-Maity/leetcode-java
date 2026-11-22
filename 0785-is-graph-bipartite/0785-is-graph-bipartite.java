class Solution {
    boolean res=true;
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        int[]  colors=new int[V];
        Arrays.fill(colors,-1);
        for(int i=0;i<V;i++){
            if (colors[i] == -1) {
                dfs(graph, i, 0, colors);
            }
              if (!res) return false;}
       return res;
        }
    
        
    

    void dfs(int[][] graph,int node,int c,int[] colors ){
        colors[node]=c;
        for(int neigbour: graph[node]){
            if(colors[neigbour]!= -1 && colors[neigbour]==c){
                res=false;
            }
            if(colors[neigbour]==-1){
                dfs(graph,neigbour,1-c,colors);
            }
        }
       if (!res) return;
    }
}
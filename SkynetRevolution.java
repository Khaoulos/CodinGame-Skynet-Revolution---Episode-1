import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the total number of nodes in the level, including the gateways
        int L = in.nextInt(); // the number of links
        int E = in.nextInt(); // the number of exit gateways
        List<Integer> gateWaysNode = new ArrayList<Integer>();
        List<Integer> ExitGateWaysNode = new ArrayList<Integer>();
        
        
        for (int i = 0; i < L; i++) {
            int N1 = in.nextInt(); // N1 and N2 defines a link between these nodes
            int N2 = in.nextInt();
            if (N1 == 0){
                ExitGateWaysNode.add(N2);
            }
            else if (N2 == 0){
                ExitGateWaysNode.add(N1);
            }
        }
        for (int i = 0; i < E; i++) {
            int EI = in.nextInt(); // the index of a gateway node
            gateWaysNode.add(EI);
        }

        // game loop
        while (true) {
            int SI = in.nextInt(); // The index of the node on which the Skynet agent is positioned this turn

            // Write an action using System.out.println()
            
            // To debug: System.err.println("Debug messages...");
          

            // Example: 0 1 are the indices of the nodes you wish to sever the link between
      
            int noeud=0;
            boolean trouve=false;
            for(int i=0;i<ExitGateWaysNode.size(); i++){
             
                if(ExitGateWaysNode.get(i) != SI && !trouve){
                    noeud=ExitGateWaysNode.get(i);
                
                }
                else{
                    noeud=SI;
                    trouve=true;
                }
        
            }
       
           
            
            System.out.println(noeud+" "+gateWaysNode.get(0));
            System.err.print("Dans le while "+SI);
        }
    }
}
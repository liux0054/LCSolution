package hard.lc801tolc1000;

public class LC956 {

    public int tallestBillboard(int[] rods) {
       int[][][] f = new int[rods.length][3][2];

       f[0][0][0] = 0;
       f[0][0][1] = 0;
       f[0][1][0] = rods[0];
       f[0][1][1] = 0;
       f[0][2][0] = 0;
       f[0][2][1] = rods[0];
       int SetOne = 0;
       int SetTwo = 1;
       int BelongToNone = 0;
       int BelongToSetOne = 1;
       int BelongToSetTwo = 2;
       for(int index=1; index<rods.length; index++){
           //index dose not belong to any set, value of set 1
           f[index][BelongToNone][SetOne] = Math.max(Math.max(f[index-1][BelongToNone][SetOne], f[index-1][BelongToSetOne][SetOne]), f[index-1][BelongToSetTwo][SetOne]);

           //index dose not belong to any set, value of set 2
           f[index][BelongToNone][SetTwo] = Math.max(Math.max(f[index-1][BelongToNone][SetTwo], f[index-1][BelongToSetOne][SetTwo]), f[index-1][BelongToSetTwo][SetTwo]);

           //index dose belong to set 1, value of set 1
           f[index][BelongToSetOne][SetOne] = Math.max(Math.max(f[index-1][BelongToNone][SetOne], f[index-1][BelongToSetOne][SetOne]), f[index-1][BelongToSetTwo][SetOne]) + rods[index];

           //index dose belong to set 1, value of set 2
           f[index][BelongToSetOne][SetTwo] = Math.max(Math.max(f[index-1][BelongToNone][SetTwo], f[index-1][BelongToSetOne][SetTwo]), f[index-1][BelongToSetTwo][SetTwo]);

           //index dose belong to set 2, value of set 1
           f[index][BelongToSetTwo][SetOne] = Math.max(Math.max(f[index-1][BelongToNone][SetOne], f[index-1][BelongToSetOne][SetOne]), f[index-1][BelongToSetTwo][SetOne]);

           //index dose belong to set 2, value of set 2
           f[index][BelongToSetTwo][SetTwo] = Math.max(Math.max(f[index-1][BelongToNone][SetTwo], f[index-1][BelongToSetOne][SetTwo]), f[index-1][BelongToSetTwo][SetTwo]) + rods[index];

       }

       int answer = 0;
       for(int i=0; i<f.length; i++){
           for(int j=0; j<3; j++){
               if(f[i][j][0] == f[i][j][1]){
                   if(f[i][j][0] > answer){
                       answer = f[i][j][0];
                   }
               }
           }
       }
       return answer;
    }
}

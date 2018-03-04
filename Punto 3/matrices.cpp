#include <iostream>
#include <time.h>
#include <string>

using namespace std;

int main(){
    int n;
    cin>>n;
    double t=0;
    int t1=0;
    for(int x=1;x<=n;x++){
        int c[x][x];
        int d[x][x];
        int e[x][x];
        for(int y=0;y<x;y++){
            for(int z=0;z<x;z++){
                c[y][z] = 1;
                d[y][z] = 2;
                e[y][z] = 0;
            }
        }
        for(int y=0;y<x;y++){
            for(int z=0;z<x;z++){
                clock_t ti=clock();
                for(int w=0;w<x;w++){
                    e[y][z]=e[y][z]+(c[y][w]*d[w][z]);
                }
                clock_t tt = clock();
                t=t+(tt-ti);
                t1=t1+1;
            }
        }
        t=t/t1;
        cout<< "Tiempo para n="<<x<<": "<<(t)<<endl;
    }
    return 0;
}
// MI PC                                                         Ideone.com
/* Tiempo para n=1: 1                                            Tiempo para n=1: 1
Tiempo para n=2: 0.6                                             Tiempo para n=2: 0.2
Tiempo para n=3: 0.257143                                        Tiempo para n=3: 0.157143
Tiempo para n=4: 0.208571                                        Tiempo para n=4: 0.138571
Tiempo para n=5: 0.18561                                         Tiempo para n=5: 0.0934286 
Tiempo para n=6: 0.133908                                        Tiempo para n=6: 0.0669608
Tiempo para n=7: 0.115242                                        Tiempo para n=7: 0.0861926
Tiempo para n=8: 0.103506                                        Tiempo para n=8: 0.064148
Tiempo para n=9: 0.182819                                        Tiempo para n=9: 0.063383 
Tiempo para n=10: 0.0809943                                      Tiempo para n=10: 0.0521127 
Tiempo para n=11: 0.0772352                                      Tiempo para n=11: 0.0534627 
Tiempo para n=12: 0.0755034                                      Tiempo para n=12: 0.0477746 
Tiempo para n=13: 0.0709103                                      Tiempo para n=13: 0.0427934 
Tiempo para n=14: 0.0710058                                      Tiempo para n=14: 0.0424067   
Tiempo para n=15: 0.0944121                                      Tiempo para n=15: 0.037131 
Tiempo para n=16: 0.0662396                                      Tiempo para n=16: 0.0387949 
Tiempo para n=17: 0.0711856                                      Tiempo para n=17: 0.0369965 
Tiempo para n=18: 0.0735283                                      Tiempo para n=18: 0.0346311 
Tiempo para n=19: 0.0733091                                      Tiempo para n=19: 0.0311881 
Tiempo para n=20: 0.0655308                                      Tiempo para n=20: 0.0317182 
Tiempo para n=21: 0.0676731                                      Tiempo para n=21: 0.03142   
Tiempo para n=22: 0.0635224                                      Tiempo para n=22: 0.0303113 
Tiempo para n=23: 0.0594504                                      Tiempo para n=23: 0.0291467 
Tiempo para n=24: 0.0567468                                      Tiempo para n=24: 0.0273529 
Tiempo para n=25: 0.0544899                                      Tiempo para n=25: 0.0266113 
*/

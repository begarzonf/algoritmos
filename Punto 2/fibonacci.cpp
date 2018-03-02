//para short int overflow en n=24
//para unsigned short int overflow en n=25
//para int overflow en n=47
//para unsigned int overflow en n=48
//para long long int overflow en n=93
//para unsigned long long int overflow en n=94
#include <iostream>
using namespace std;
//el #if en consejo de sergio andres ayala castillo donde el me enseño su utilidad

int main() {
    #define Tipo 6//1 para short int, 2 para unsigned short int, 3 para int, 4 para unsigned int, 5 para long long int, 6 para unsigned long long int.
    #if Tipo == 1
    short int a,b,c;
    #elif Tipo == 2
    unsigned short int a,b,c;
    #elif Tipo == 3
    int a,b,c;
    #elif Tipo == 4
    unsigned int a,b,c;
    #elif Tipo == 5
    long long int a,b,c;
    #else
    unsigned long long int a,b,c;
    #endif 
		int n;
		cin >> n;
    a=0;
    b=1;
    c=0;
    if (n==1 || n==2){
      cout << endl << 1 << endl; 
    }else{
      for(int i=1;i<n;i++){
        c=a+b;
        a=b;
        b=c;
      }
        cout << endl << c << endl; 
    }
 
	return 0;
}

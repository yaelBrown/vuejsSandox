#include <iostream>
using namespace std;

class Calculator
{
  private:

  public:
    calculator() { }
    ~Calculator() { }
    int PrimeGenerator (int, int);
}

int main(int argc, char const *argv[])
{
  cout << "Please enter two numbers: " << endl;
  int x ,y;
  cin >>x>>y;


  return 0;
}

int Calculator::PrimeGenerator(int x, int y)
{
  for (int i = x; i < y; i++)
  {
    bool prime = true;
    for (int j = 2; j * j <= i; j++)
    {
      if (i % j != 0)
      {
        prime = false;
        break;
      }
    }

    if (prime==true)
    {
      cout << i << " ";
    }



  }
}
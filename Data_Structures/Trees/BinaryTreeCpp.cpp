#include <iostream>

template <typename T> class Node{
    private:
        T data;
        Node* right, left;   
    public:
        Node(T data){
            this->data = data;
        }
        ~Node(){
           // delete data;
        }     
};

class Tree{

};


int main(){



    return 0;
}
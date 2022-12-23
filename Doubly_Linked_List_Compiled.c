#include <stdio.h>
#include <stdlib.h>
 

struct Node {
    int data;
    struct Node* next;
    struct Node* prev;
};
 

void InsertAtStart(struct Node** head, int data)
{
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
 
    temp->data = data;
 
    temp->next = (*head);
    temp->prev = NULL;
 
    if ((*head) != NULL)
        (*head)->prev = temp;
 
    (*head) = temp;
}

void insertBefore(struct Node **head, struct Node* fixNode, int num){
    struct Node *ptr, *temp;

    temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = num;
  

    if (*head == fixNode) {
        temp->next = *head;
        (*head)->prev = temp;
        *head = temp;
        return;
    }

    ptr = *head;
    while (ptr->next != fixNode) {
        ptr = ptr->next;
    }

    temp->next = fixNode;
    temp->prev = ptr;
    ptr->next = temp;
    fixNode->prev = temp;
}



void InsertAtEnd(struct Node** head, int data)
{
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    struct Node* ptr = *head; 
    
    if (*head == NULL) {
      	temp->data = data;
        ptr = temp;
        return;
    }
 
  
    while (ptr->next != NULL)
        ptr = ptr->next;
  	
    temp->data = data;
    temp->next = NULL;
    ptr->next = temp;
 
    temp->prev = ptr;
 
    return;
}

void deleteNode(struct Node **head, struct Node *nodeToDelete) {
    if (*head == NULL) {
        return;
    }

    if (*head == nodeToDelete) {
        *head = (*head)->next;
        free(nodeToDelete);
        return;
    }

    struct Node *ptr = *head;
    while (ptr->next != nodeToDelete) {
        ptr = ptr->next;
    }

    ptr->next = nodeToDelete->next;
    if (nodeToDelete->next != NULL) {
        nodeToDelete->next->prev = ptr;
    }
    free(nodeToDelete);
}

void print(struct Node* node)
{
  
    while (node != NULL) {
        printf(" %d ", node->data);
        node = node->next;
    }
}
 

int main()
{
    struct Node* head = NULL;
 
    InsertAtStart(&head, 6);
 
    InsertAtEnd(&head, 7);
    InsertAtEnd(&head, 1);
 
    deleteNode(&head, head->next->next);
 
    print(head);
 
    return 0;
}

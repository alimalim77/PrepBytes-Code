void InsertAtEnd(struct Node** head, int data)
{
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    struct Node* ptr = *head; 
    
    temp->data = data
      
    if (*head == NULL) {
        ptr = temp;
        return;
    }
 
  
    while (ptr->next != NULL)
        ptr = ptr->next;
  	
    temp->next = NULL;
    ptr->next = temp;
 
    temp->prev = ptr;
 
    return;
}

void InsertAtStart(struct Node** head, int data)
{
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
 
    temp->data = new_data;
 
    temp->next = (*head);
    temp->prev = NULL;
 
    if ((*head) != NULL)
        (*head)->prev = temp;
 
    (*head) = temp;
}
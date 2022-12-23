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
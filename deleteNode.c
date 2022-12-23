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





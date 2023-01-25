class MyStack:
    def __init__(self):
        self.elements = []
 
    def is_empty(self):
        return not self.elements
 
    def push(self, data):
        self.elements.append(data)
 
    def pop(self):
        return self.elements.pop()

    def size(self):
        return len(self.elements)
    
    def printStack(self):
        return self.elements
 
stack = MyStack()
while True:
    print('push')
    print('pop')
    print('close')
    ans = stack.printStack()
    print(ans)
    operation = input('What would you like to do? ')
 
    if operation == 'push':
        ele = int(input("Enter the element to push"))
        stack.push(ele)
    elif operation == 'pop':
        if stack.is_empty():
            print('Stack is empty.')
        else:
            print('Popped value: ', stack.pop())
    elif operation == 'close':
        break
    elif operation == "size":
        print("Size of stack is",stack.size())

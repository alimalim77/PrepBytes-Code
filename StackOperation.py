class MyStack:
    def __init__(self):
        self.elements = []
 
    def is_empty(self):
        return not self.elements
 
    def push(self, data):
        self.elements.append(data)
 
    def pop(self):
        return self.elements.pop()

    def top(self):
        if len(self.elements):
            return self.elements[-1]
        else:
            return -1

    def size(self):
        return len(self.elements)
    
    def printStack(self):
        return self.elements
 
stack = MyStack()
stack.push(20)
print("Modified stack is",stack.printStack())
stack.push(25)
print("Modified stack is",stack.printStack())
#Stack Size called
print("Stack Size is",stack.size())
stack.pop()
print("Modified stack is",stack.printStack())
#Stack Top is Called
print("Stack Top is",stack.top())



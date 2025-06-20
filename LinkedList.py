class Node:
    def __init__(self, value=None, next=None):
        self.value = value
        self.next = next
    
class LinkedList:
    def __init__(self):
        self.head = None

    def insertHead(self, value):
        node = Node(value)
        node.next = self.head
        self.head = node

    def append(self, value):
        temp = self.head
        while temp.next!=None:
            temp = temp.next
        node = Node(value)
        temp.next = node

    def insert(self, value, index):
        target = 0
        temp = self.head
        node = Node(value)
        if index == 0:
            node.next = self.head
            self.head = node
            return
        while temp:
            if target == index-1:
                node.next = temp.next
                temp.next = node
                break
            target += 1
            temp = temp.next
            if temp == None:
                print("Ivalid index for insert operation")

    def removeAt(self, index):
        target = 0
        temp = self.head
        if index == 0:
            self.head = temp.next
        while temp:
            if target == index-1:
                temp.next = temp.next.next
                break
            target += 1
            temp = temp.next

    def remove(self, value):
        temp = self.head
        while temp.next:
            if value == temp.next.value:
                temp.next = temp.next.next
            else:
                temp = temp.next
        if value == self.head.value:
            self.head = temp.next

    # def reverse(self):
    #     temp = self.head
    #     count = 0
    #     while temp.next:
    #         temp = temp.next
    #         count += 1
    #     self.head = None
    #     while count>=0:
    #         temp.ne
             
    def print(self):
        temp = self.head
        while temp:
            print(str(temp.value))
            temp = temp.next

llist = LinkedList()

llist.insertHead(10)
llist.insertHead(10)
llist.insertHead(11)
llist.insertHead(1)
llist.remove(10)
llist.print()
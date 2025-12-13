class node:
    def __init__(self,data,next=None):
        self.data:int = data
        self.next:self = next


list = [1,2,3,4,5,6,7,8,9]

def get_linked_list(start,end):
    dist = {}
    head = node(None)
    start_ = head
    for ind,data in enumerate(list):
        pt = node(data)
        dist[ind+1] = pt  
        head.next = pt
        head = pt
    dist[start].next = dist[end]
    return start_.next

linked_list = get_linked_list(9,3)
curr = linked_list
while curr:
    if curr.data==9:
        print(curr.next.data)
        break
    curr = curr.next
    print(curr.data,end="==>")

fast = slow = linked_list
index = 0
while fast and fast.next:
    fast = fast.next.next
    slow = slow.next
    print(f"step {index+1} : ",slow.data,"<===>",fast.data)
    index+=1
    if slow==fast:
        print("meeting point : ",slow.data)
        break

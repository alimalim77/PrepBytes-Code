def heapify(arr, n, i):
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2
 
    if l < n and arr[i] < arr[l]:
        largest = l
 
    if r < n and arr[largest] < arr[r]:
        largest = r
 
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        heapify(arr, n, largest)


def buildHeap(arr):
    n = len(arr)
    for i in range(n, -1, -1):
        heapify(arr, n, i)
    print(arr)

buildHeap([2,3,5,7,8,9,4])
def heapify(nums, N, i):
    largest = i
    left = 2 * i + 1
    right = 2 * i + 2
    if left < N and nums[largest] < nums[left]:
        largest = left
    if right < N and nums[largest] < nums[right]:
        largest = right
    if largest != i:
        nums[i], nums[largest] = nums[largest], nums[i]
        heapify(nums, N, largest)

def heapSort(nums):
    N = len(nums)
    for i in range(N//2 - 1, -1, -1):
        heapify(nums, N, i)
    for i in range(N-1, 0, -1):
        nums[i], nums[0] = nums[0], nums[i]
        heapify(nums, i, 0)

nums = [35,32,10,5,3]
heapSort(nums)
print(nums)

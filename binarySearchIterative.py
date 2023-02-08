def binary_search(arr, target):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2
        current = arr[mid]

        if current == target:
            return mid
        if current > target:
            high = mid - 1
        else:
            low = mid + 1

    return -1 

print(binary_search([20,30,40,60,80,90], 90))

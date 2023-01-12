
def find_triplet(nums, target_sum):
    for i in range(len(nums)-2):
        s = {}
        cur = target_sum - nums[i]
        for j in range(i+1, len(nums)):
            if (cur - nums[j]) in s:
                print(f"Triplet is {nums[i]}, {nums[j]}, {cur-nums[j]} at {i},{j} and {s[cur-nums[j]]}")
                return True
            s[nums[j]] = j
    return False

numbers = [-1,1,0,2,-2]
target = 3
print(find_triplet(numbers, target))

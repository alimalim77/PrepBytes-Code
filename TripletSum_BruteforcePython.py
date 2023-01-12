def find_triplet(nums, target_sum):
    for i in range(len(nums)-2):
        for j in range(i+1, len(nums)-1):
            for k in range(j+1, len(nums)):
                if nums[i] + nums[j] + nums[k] == target_sum:
                    print(f"Triplet is {nums[i]}, {nums[j]}, {nums[k]} at position {i},{j} and {k}")
                    return True
    return False

numbers = [-1,1,0,2,-2]
target = 3
print(find_triplet(numbers, target))

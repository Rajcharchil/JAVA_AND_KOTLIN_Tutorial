public boolean hasPairWithSum(int[] arr, int sum) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
        if (set.contains(num)) {
            return true;
        }
        set.add(sum - num);
    }
    return false;
}


// 2. Best Time to Buy and Sell Stock
// This problem is about finding the maximum profit from a single transaction, which can be solved by finding the minimum price so far and the maximum profit at each step.


public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice;
        }
    }
    return maxProfit;
}



// 3. Find Duplicates
// To find duplicates in an array, a HashSet can be used to track seen numbers.


public List<Integer> findDuplicates(int[] nums) {
    HashSet<Integer> seen = new HashSet<>();
    List<Integer> duplicates = new ArrayList<>();
    for (int num : nums) {
        if (seen.contains(num)) {
            duplicates.add(num);
        } else {
            seen.add(num);
        }
    }
    return duplicates;
}




// 4. Product of Array Except Self
// This problem involves creating an output array where each element is the product of all the numbers in the array except the number at that index.


public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] output = new int[n];
    int left = 1;
    for (int i = 0; i < n; i++) {
        output[i] = left;
        left *= nums[i];
    }
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
        output[i] *= right;
        right *= nums[i];
    }
    return output;
}




// 5. Maximum Subarray (Kadane’s Algorithm)
// This problem is to find the maximum sum of a contiguous subarray in an array.


public int maxSubArray(int[] nums) {
    int maxCurrent = nums[0];
    int maxGlobal = nums[0];
    for (int i = 1; i < nums.length; i++) {
        maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
        if (maxCurrent > maxGlobal) {
            maxGlobal = maxCurrent;
        }
    }
    return maxGlobal;
}




// 6. Maximum Product Subarray
// This problem requires finding the maximum product of a contiguous subarray. We handle the sign change by also keeping track of the minimum product.

public int maxProduct(int[] nums) {
    if (nums.length == 0) return 0;

    int maxHere = nums[0], minHere = nums[0], maxSoFar = nums[0];
    for (int i = 1; i < nums.length; i++) {
        int temp = maxHere;
        maxHere = Math.max(Math.max(maxHere * nums[i], minHere * nums[i]), nums[i]);
        minHere = Math.min(Math.min(temp * nums[i], minHere * nums[i]), nums[i]);
        if (maxHere > maxSoFar) {
            maxSoFar = maxHere;
        }
    }
    return maxSoFar;
}



7. Find Minimum in Rotated Sorted Array
This problem is solved by binary search. Even in a rotated array, one half of the array is always sorted.


public int findMin(int[] nums) {
    if (nums.length == 1) {
        return nums[0];
    }

    int left = 0, right = nums.length - 1;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (mid > 0 && nums[mid] < nums[mid - 1]) {
            return nums[mid];
        }
        if (nums[mid] >= nums[left] && nums[mid] > nums[right]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return nums[left];
}




8. Search in Rotated Sorted Array
Binary search is used here too, but we decide to move left or right based on where the target might be.


  
public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) return mid;
        
        if (nums[left] <= nums[mid]) {
            if (target >= nums[left] && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } else {
            if (target > nums[mid] && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    return -1;
}





9. 3Sum
This problem involves finding all unique triplets in the array which gives the sum of zero.


public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> output = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
        if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
            int lo = i+1, hi = nums.length-1, sum = 0 - nums[i];
            while (lo < hi) {
                if (nums[lo] + nums[hi] == sum) {
                    output.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                    lo++; hi--;
                } else if (nums[lo] + nums[hi] < sum) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
    }
    return output;
}




10. Container With Most Water
The goal is to maximize the area between two indices in an array, using a two-pointer approach.



  
public int maxArea(int[] height) {
    int maxArea = 0, left = 0, right = height.length - 1;
    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}





11. Find the Factorial of a Large Number
Handling large numbers typically requires using BigInteger in Java.


  
import java.math.BigInteger;

public BigInteger factorial(int n) {
    BigInteger result = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
        result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
}



12. Trapping Rain Water
This problem can be solved using two pointers to track the maximum heights from both ends.


  
public int trap(int[] height) {
    int left = 0, right = height.length - 1;
    int leftMax = 0, rightMax = 0;
    int trappedWater = 0;
    
    while (left <= right) {
        if (height[left] <= height[right]) {
            if (height[left] >= leftMax) {
                leftMax = height[left];
            } else {
                trappedWater += leftMax - height[left];
            }
            left++;
        } else {
            if (height[right] >= rightMax) {
                rightMax = height[right];
            } else {
                trappedWater += rightMax - height[right];
            }
            right--;
        }
    }
    return trappedWater;
  }

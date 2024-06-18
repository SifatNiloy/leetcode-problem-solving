#include <vector>
#include <unordered_map>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> numMap; 
        
        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];
            
            
            if (numMap.count(complement) > 0) {
                return {numMap[complement], i};  
            }
            
          
            numMap[nums[i]] = i;
        }
        
        return {};  
    }
};
## Sliding Window Pattern


### General Properties:

Size of SubArray will be { Arr.len - subArrSize + 1 }
</br>
Range of SubArray is { I to I + subArrSize }

### Variation 1:

find or calculate something among all the contiguous SubArrays (or SubLists) of a given size

### Approach:

1) Same Start Point for both start & End will Iterate till Arr.len
2) Perform Operation (Example: Sum) and Inclusion

3) Contd to slide is { End >=  subArrSize -1 }
        ( = for first time )
        ( > is for consecutive SubArray of subArrSize )

4) Result is calculated for (Array or Value)

5) Exclusion
        </br>
        [One Out] to calculate (Example: Sum)
        </br>
        [One In] will be performed after formation first subArray with SubArrSize


### Variation 2:

find the length of the smallest contiguous subArray whose sum is greater than or equal to ‘S’

The sliding window size is not fixed

### Approach:

1) Similarly, exclusion will start when calculated (sum or operation) reaches target.
   
2) Exclusion will be done continuous in loop to get min (max) length.

2) other structure will be same in this case



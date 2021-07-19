Sliding Window Pattern


find or calculate something among all the contiguous SubArrays (or SubLists) of a given size

Size of SubArray will be { Arr.len - subArrSize + 1 }
Range of SubArray is { I to I + subArrSize }

Variation 1:

Approach:

Same Start Point for both start & End will Iterate till Arr.len

Perform Operation (Sum)

Contd to slide is { End >=  subArrSize -1 }
( = for first time )
( > is for consecutive SubArray of subArrSize )

Result is calculated for (Array or Value)

[ One Out ] to calculate (Ex Sum)
[ One In  ] will be performed after formation first subArray with SubArrSize

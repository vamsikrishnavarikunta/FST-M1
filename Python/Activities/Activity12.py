def ReccurssiveAddition(num):
    if num:
        return num+ReccurssiveAddition(num-1)
    else:
        return 0
res=ReccurssiveAddition(10)
print(res)
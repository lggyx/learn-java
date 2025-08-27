accounts=[[1,2,3],[1,2,3]]

def maximumWealth(accounts):
    return max(map(sum, accounts))
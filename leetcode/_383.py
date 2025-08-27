def canConstruct(ransomNote: str, magazine: str) -> bool:
    magazine_count = {}
    for char in magazine:
        magazine_count[char] = magazine_count.get(char, 0) + 1

    for char in ransomNote:
        if magazine_count.get(char, 0) == 0:
            return False
        magazine_count[char] -= 1

    return True

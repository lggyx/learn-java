import pytest
from _383 import canConstruct

def test_can_construct_normal_case():
    """测试正常情况：magazine 包含 ransomNote 的所有字符"""
    assert canConstruct("a", "a") == True
    assert canConstruct("aa", "aab") == True
    assert canConstruct("abc", "cba") == True

def test_can_construct_edge_case_empty_strings():
    """测试边界条件：空字符串"""
    assert canConstruct("", "") == True  # 两个空字符串
    assert canConstruct("", "a") == True  # ransomNote 为空
    assert canConstruct("a", "") == False  # magazine 为空

def test_can_construct_edge_case_insufficient_characters():
    """测试边界条件：magazine 中字符不足"""
    assert canConstruct("aa", "a") == False  # 缺少一个 'a'
    assert canConstruct("aab", "aa") == False  # 缺少 'b'

def test_can_construct_edge_case_case_sensitivity():
    """测试边界条件：大小写敏感"""
    assert canConstruct("A", "a") == False  # 大小写不匹配
    assert canConstruct("a", "A") == False  # 大小写不匹配

def test_can_construct_edge_case_special_characters():
    """测试边界条件：特殊字符"""
    assert canConstruct("!", "!@#") == True  # 包含特殊字符
    assert canConstruct("@", "!") == False  # 不包含特殊字符

def test_can_construct_edge_case_unicode_characters():
    """测试边界条件：Unicode 字符"""
    assert canConstruct("你好", "你好世界") == True  # 包含 Unicode 字符
    assert canConstruct("世界", "你好") == False  # 不包含 Unicode 字符

if __name__ == '__main__':

    pytest.main(['-v', __file__])
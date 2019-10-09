package _a10_泛型;
/**
 *  继承链
 *   Object
 *     | 
 *   Father
 *    /  \
 * Apple Pear
 *   |
 *  FujiApple
 */
public class _9_通配符继承链bean {}
class _9_Apple extends _9_通配符继承链bean{}
class _9_Pear extends _9_通配符继承链bean{}
class _9_FujiApple extends _9_Apple{}

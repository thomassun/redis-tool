package net.coderbee.redis.rdb

import net.coderbee.redis.RdbString

/**
 * rdb �ļ������Ļص��������
 */
trait RdbVisitor {
    def onVersion(version: Int)

    def onDB(dbNum: Int)

    def onKV(key: RdbString, value: Any)

    def onKV(expireMills: Long, key: RdbString, value: Any)
    
    def onRdbEnd()
    
    def onError(err: Exception)
}
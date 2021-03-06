dataSource {
    pooled = true
    driverClassName = "org.hsqldb.jdbcDriver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
//            url = "jdbc:hsqldb:mem:devDB"

			driverClassName = "com.mysql.jdbc.Driver";
			username = "heartbeat"
			password = "heartbeat.123"
			url = "jdbc:mysql://localhost/heartbeat";
			// dialect = org.hibernate.dialect.MySQLInnoDBDialect;
			// logSql = true;
            
            //pooling parameters
            properties {
                maxActive = 50
                minIdle = 10
                initialSize = 25 
                maxWait = 10000 
                
                //minEvictableIdleTimeMillis = 60000
                //timeBetweenEvictionRunsMillis = 60000
                minEvictableIdleTimeMillis=1800000
                timeBetweenEvictionRunsMillis=1800000
                numTestsPerEvictionRun=3
                
                testOnBorrow=true
                testWhileIdle=true
                testOnReturn=true
                
                validationQuery = "SELECT 1"
            }
        
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:mem:testDb"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            //url = "jdbc:hsqldb:file:prodDb;shutdown=true"
            
            driverClassName = "com.mysql.jdbc.Driver";
			username = "heartbeat"
			password = "heartbeat.123"
			url = "jdbc:mysql://localhost/heartbeat";
			// dialect = org.hibernate.dialect.MySQLInnoDBDialect;
			// logSql = true;
            
            //pooling parameters
            properties {
                maxActive = 50
                minIdle = 10
                initialSize = 25 
                maxWait = 10000 
                
                //minEvictableIdleTimeMillis = 60000
                //timeBetweenEvictionRunsMillis = 60000
                minEvictableIdleTimeMillis=1800000
                timeBetweenEvictionRunsMillis=1800000
                numTestsPerEvictionRun=3
                
                testOnBorrow=true
                testWhileIdle=true
                testOnReturn=true
                
                validationQuery = "SELECT 1"
            }
            
        }
    }
}

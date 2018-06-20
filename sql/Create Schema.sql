
DECLARE @DBName VARCHAR(50);
SET @DBName = 'sps';

DECLARE @myScript VARCHAR(250);

set @myScript = 'exec '+ QUOTENAME(@DBName) + '..sp_executesql N''create schema iam'''

execute(@myScript)
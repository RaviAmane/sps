USE sps;
CREATE TABLE iam.Action
(
     ActionId BIGINT NOT NULL IDENTITY,
     Name varchar(50) NOT NULL
);
GO

USE sps;
ALTER TABLE iam.Action
     ADD CONSTRAINT PK_Action
          PRIMARY KEY (ActionId);
GO

USE sps;
CREATE TABLE iam.Resource
(
     ResourceId BIGINT NOT NULL IDENTITY,
     Name varchar(50) NOT NULL
);
GO

USE sps;
ALTER TABLE iam.Resource
     ADD CONSTRAINT PK_Resource
          PRIMARY KEY (ResourceId);
GO

USE sps;
CREATE TABLE iam.Permission
(
     PermissionId BIGINT NOT NULL IDENTITY,
	 ResourceId BIGINT NOT NULL,
	 ActionId BIGINT NOT NULL,
);
GO

USE sps;
ALTER TABLE iam.Permission
     ADD CONSTRAINT PK_Permission
          PRIMARY KEY (PermissionId);
GO

USE sps;
ALTER TABLE iam.Permission
     ADD CONSTRAINT FK_Permission_Resource
          FOREIGN KEY (ResourceId)
               REFERENCES iam.Resource(ResourceID);
GO

USE sps;
ALTER TABLE iam.Permission
     ADD CONSTRAINT FK_Permission_Action
          FOREIGN KEY (ActionID)
               REFERENCES iam.Action(ActionID);
GO

USE sps;
CREATE TABLE iam.Role
(
     RoleId BIGINT NOT NULL IDENTITY,
     Name varchar(50) NOT NULL
);
GO

USE sps;
ALTER TABLE iam.Role
     ADD CONSTRAINT PK_Role
          PRIMARY KEY (RoleId);
GO

USE sps;
CREATE TABLE iam.Policy
(
     PolicyId BIGINT NOT NULL IDENTITY,
	 RoleId BIGINT NOT NULL,
	 PermissionId BIGINT NOT NULL
);
GO

USE sps;
ALTER TABLE iam.Policy
     ADD CONSTRAINT PK_Policy
          PRIMARY KEY (PolicyId);
GO

USE sps;
ALTER TABLE iam.Policy
     ADD CONSTRAINT FK_Policy_Role
          FOREIGN KEY (RoleId)
               REFERENCES iam.Role(RoleId);
GO

USE sps;
ALTER TABLE iam.Policy
     ADD CONSTRAINT FK_Policy_Permission
          FOREIGN KEY (PermissionId)
               REFERENCES iam.Permission(PermissionId);
GO

USE sps;
CREATE TABLE iam.[User]
(
     UserId BIGINT NOT NULL IDENTITY,
     email varchar(50) NOT NULL,
	 [password] varchar(64) NOT NULL
);
GO

USE sps;
ALTER TABLE iam.[User]
     ADD CONSTRAINT PK_User
          PRIMARY KEY (UserId);
GO

USE sps;
CREATE TABLE iam.Entity
(
     EntityId BIGINT NOT NULL IDENTITY,
     Name varchar(50) NOT NULL
);
GO

USE sps;
ALTER TABLE iam.Entity
     ADD CONSTRAINT PK_Entity
          PRIMARY KEY (EntityId);
GO

USE sps;
CREATE TABLE iam.Entitlement
(
     EntitlementId BIGINT NOT NULL IDENTITY,
	 EntityId BIGINT NOT NULL,
	 UserId BIGINT NOT NULL,
	 RoleId BIGINT NOT NULL
);
GO

USE sps;
ALTER TABLE iam.Entitlement
     ADD CONSTRAINT PK_Entitlement
          PRIMARY KEY (EntitlementId);
GO

USE sps;
ALTER TABLE iam.Entitlement
     ADD CONSTRAINT FK_Entitlement_Entity
          FOREIGN KEY (EntityId)
               REFERENCES iam.Entity(EntityId);
GO

USE sps;
ALTER TABLE iam.Entitlement
     ADD CONSTRAINT FK_Entitlement_User
          FOREIGN KEY (UserId)
               REFERENCES iam.[User](UserId);
GO

USE sps;
ALTER TABLE iam.Entitlement
     ADD CONSTRAINT FK_Entitlement_Role
          FOREIGN KEY (RoleId)
               REFERENCES iam.Role(RoleId);
GO

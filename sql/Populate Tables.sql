USE [sps]
GO

INSERT INTO [iam].[Action]
           ([Name])
     VALUES
           ('ALL')
GO
INSERT INTO [iam].[Action]
           ([Name])
     VALUES
           ('GET')
GO
INSERT INTO [iam].[Action]
           ([Name])
     VALUES
           ('PUT')
GO
INSERT INTO [iam].[Action]
           ([Name])
     VALUES
           ('POST')
GO
INSERT INTO [iam].[Action]
           ([Name])
     VALUES
           ('PATCH')
GO
INSERT INTO [iam].[Action]
           ([Name])
     VALUES
           ('DELETE')
GO

INSERT INTO [iam].[Resource]
           ([Name])
     VALUES
           ('order')
GO

INSERT INTO [iam].[Resource]
           ([Name])
     VALUES
           ('product')
GO

INSERT INTO [iam].[Resource]
           ([Name])
     VALUES
           ('preference')
GO

INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (1,1)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (1,2)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (1,3)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (1,4)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (1,5)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (1,6)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (2,1)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (2,2)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (2,3)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (2,4)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (2,5)
GO
INSERT INTO [iam].[Permission]
           ([ResourceId]
           ,[ActionId])
     VALUES
           (2,6)
GO

INSERT INTO [iam].[Role]
           ([Name])
     VALUES
           ('CREATE_ORDER')
GO

INSERT INTO [iam].[Role]
           ([Name])
     VALUES
           ('VIEW_ORDER')
GO

INSERT INTO [iam].[Policy]
           ([RoleId]
           ,[PermissionId])
     VALUES
           (1,1)
GO
INSERT INTO [iam].[Policy]
           ([RoleId]
           ,[PermissionId])
     VALUES
           (1,7)
GO

INSERT INTO [iam].[Policy]
           ([RoleId]
           ,[PermissionId])
     VALUES
           (2,2)
GO
INSERT INTO [iam].[Policy]
           ([RoleId]
           ,[PermissionId])
     VALUES
           (2,8)
GO

INSERT INTO [iam].[User]
           ([email]
           ,[password])
     VALUES
           ('ravi.amane@ra.com', 'password')
GO
INSERT INTO [iam].[User]
           ([email]
           ,[password])
     VALUES
           ('arjun.amane@ra.com', 'password')
GO
INSERT INTO [iam].[User]
           ([email]
           ,[password])
     VALUES
           ('sid.amane@ra.com', 'password')
GO
INSERT INTO [iam].[User]
           ([email]
           ,[password])
     VALUES
           ('pinkle.amane@ra.com', 'password')
GO

INSERT INTO [iam].[Entity]
           ([Name])
     VALUES
           ('Slade')
GO
INSERT INTO [iam].[Entity]
           ([Name])
     VALUES
           ('SJOG')
GO
INSERT INTO [iam].[Entity]
           ([Name])
     VALUES
           ('HSNB')
GO

INSERT INTO [iam].[Entitlement]
           ([EntityId]
           ,[UserId]
           ,[RoleId])
     VALUES
           (1, 1, 1)
GO
INSERT INTO [iam].[Entitlement]
           ([EntityId]
           ,[UserId]
           ,[RoleId])
     VALUES
           (2, 1, 1)
GO
INSERT INTO [iam].[Entitlement]
           ([EntityId]
           ,[UserId]
           ,[RoleId])
     VALUES
           (3, 1, 1)
GO

INSERT INTO [iam].[Entitlement]
           ([EntityId]
           ,[UserId]
           ,[RoleId])
     VALUES
           (1, 2, 2)
GO
INSERT INTO [iam].[Entitlement]
           ([EntityId]
           ,[UserId]
           ,[RoleId])
     VALUES
           (2, 2, 2)
GO
INSERT INTO [iam].[Entitlement]
           ([EntityId]
           ,[UserId]
           ,[RoleId])
     VALUES
           (3, 2, 2)
GO

INSERT INTO [iam].[Entitlement]
           ([EntityId]
           ,[UserId]
           ,[RoleId])
     VALUES
           (1, 3, 2)
GO

INSERT INTO [iam].[Entitlement]
           ([EntityId]
           ,[UserId]
           ,[RoleId])
     VALUES
           (1, 4, 2)
GO
INSERT INTO [iam].[Entitlement]
           ([EntityId]
           ,[UserId]
           ,[RoleId])
     VALUES
           (2, 4, 1)
GO


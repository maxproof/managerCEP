CREATE TABLE companies
(
id_company bigserial PRIMARY KEY,
companyCategory VARCHAR(50),
companyName VARCHAR(50),
companyStreet VARCHAR(50),
companyPostCode VARCHAR(50),
companyCity VARCHAR(50),
companyPhoneNumber VARCHAR(50),
companyMobileNumber VARCHAR(50),
companyEmail VARCHAR(50),
companyEmail2 VARCHAR(50),
companyComments VARCHAR(200),
companyInsertionTimestamp TIMESTAMP,
companyModificationTimestamp TIMESTAMP,
companyDeletionTimestamp TIMESTAMP,
companyLogo longblob,
companyIsActive boolean
)

longblob = private byte[] data --> attachment

CREATE TABLE contacts
(
id_contact bigserial PRIMARY KEY,
contactLastName VARCHAR(50),
contactFirstName VARCHAR(50),
contactInsertionTimestamp TIMESTAMP,
contactModificationTimestamp TIMESTAMP,
contactDeletionTimestamp TIMESTAMP,
contactCompanyName VARCHAR(50),
contactId_company Integer, //SK
contactStreet VARCHAR(50),
contactPostCode VARCHAR(50),
contactCity VARCHAR(50),
contactPhoneNumber VARCHAR(50),
contactMobileNumber VARCHAR(50),
contactEmail VARCHAR(50),
contactEmail2 VARCHAR(50),
contactPassword VARCHAR(50),
contactPassword2 VARCHAR(50),
billing VARCHAR(50),
comment VARCHAR(200),
salutations VARCHAR(50),
sendMagazine VARCHAR(50),
sendInvitation VARCHAR(50),
sendClubInvitation VARCHAR(50),
microtechnics VARCHAR(50),
magazinePublication VARCHAR(50),
executiveBoard VARCHAR(50),
strategyBoard VARCHAR(50),
servicesBoard VARCHAR(50),
trainingBoard VARCHAR(50),
coachingBoard VARCHAR(50),
industryBoard VARCHAR(50),
facilitiesBoard VARCHAR(50),
clubCompaniesBoard VARCHAR(50),
contactIsActive boolean
)
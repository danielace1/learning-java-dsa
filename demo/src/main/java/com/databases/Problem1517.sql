-- https://leetcode.com/problems/find-users-with-valid-e-mails/description/
select * from users where regexp_like(
    mail,
  '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$',
  'c'
); 
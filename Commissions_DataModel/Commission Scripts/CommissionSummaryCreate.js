var conn = new Mongo();
var db = conn.getDB("SDSCommisions");
db.createCollection("CommissionsSummary");
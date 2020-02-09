const fs = require('http');
const utility = require('./utility');

fs.appendFile('log.txt', toCelsius(process.argv[2]) + "\n", (err) => {if (err) throw err;});
Actual stack trace: 

    Unexpected character ('<' (code 60)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')
     at [Source: 
    
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <title>Bad Request</title>
            <link rel="shortcut icon" href="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAlFJREFUeNqUU8tOFEEUPVVdNV3dPe8xYRBnjGhmBgKjKzCIiQvBoIaNbly5Z+PSv3Aj7DSiP2B0rwkLGVdGgxITSCRIJGSMEQWZR3eVt5sEFBgTb/dN1yvnnHtPNTPG4PqdHgCMXnPRSZrpSuH8vUJu4DE4rYHDGAZDX62BZttHqTiIayM3gGiXQsgYLEvATaqxU+dy1U13YXapXptpNHY8iwn8KyIAzm1KBdtRZWErpI5lEWTXp5Z/vHpZ3/wyKKwYGGOdAYwR0EZwoezTYApBEIObyELl/aE1/83cp40Pt5mxqCKrE4Ck+mVWKKcI5tA8BLEhRBKJLjez6a7MLq7XZtp+yyOawwCBtkiBVZDKzRk4NN7NQBMYPHiZDFhXY+p9ff7F961vVcnl4R5I2ykJ5XFN7Ab7Gc61VoipNBKF+PDyztu5lfrSLT/wIwCxq0CAGtXHZTzqR2jtwQiXONma6hHpj9sLT7YaPxfTXuZdBGA02Wi7FS48YiTfj+i2NhqtdhP5RC8mh2/Op7y0v6eAcWVLFT8D7kWX5S9mepp+C450MV6aWL1cGnvkxbwHtLW2B9AOkLeUd9KEDuh9fl/7CEj7YH5g+3r/lWfF9In7tPz6T4IIwBJOr1SJyIGQMZQbsh5P9uBq5VJtqHh2mo49pdw5WFoEwKWqWHacaWOjQXWGcifKo6vj5RGS6zykI587XeUIQDqJSmAp+lE4qt19W5P9o8+Lma5DcjsC8JiT607lMVkdqQ0Vyh3lHhmh52tfNy78ajXv0rgYzv8nfwswANuk+7sD/Q0aAAAAAElFTkSuQmCC">
            <style>
                html, body, pre {
                    margin: 0;
                    padding: 0;
                    font-family: Monaco, 'Lucida Console', monospace;
                    background: #ECECEC;
                }
                h1 {
                    margin: 0;
                    background: #AD632A;
                    padding: 20px 45px;
                    color: #fff;
                    text-shadow: 1px 1px 1px rgba(0,0,0,.3);
                    border-bottom: 1px solid #9F5805;
                    font-size: 28px;
                }
                p#detail {
                    margin: 0;
                    padding: 15px 45px;
                    background: #F6A960;
                    border-top: 4px solid #D29052;
                    color: #733512;
                    text-shadow: 1px 1px 1px rgba(255,255,255,.3);
                    font-size: 14px;
                    border-bottom: 1px solid #BA7F5B;
                }
            </style>
        </head>
        <body>
            <h1>Bad Request</h1>
    
            <p id="detail">
                For request 'GET /' [Invalid Json: No content to map due to end-of-input
     at [Source: akka.util.ByteIterator$ByteArrayIterator$$anon$1@5e048149; line: 1, column: 0]]
            </p>
    
        </body>
    </html>
    
    
    
    
    
    
    
    ; line: 3, column: 2]
    com.fasterxml.jackson.core.JsonParseException: Unexpected character ('<' (code 60)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')
     at [Source: 
    
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <title>Bad Request</title>
            <link rel="shortcut icon" href="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAlFJREFUeNqUU8tOFEEUPVVdNV3dPe8xYRBnjGhmBgKjKzCIiQvBoIaNbly5Z+PSv3Aj7DSiP2B0rwkLGVdGgxITSCRIJGSMEQWZR3eVt5sEFBgTb/dN1yvnnHtPNTPG4PqdHgCMXnPRSZrpSuH8vUJu4DE4rYHDGAZDX62BZttHqTiIayM3gGiXQsgYLEvATaqxU+dy1U13YXapXptpNHY8iwn8KyIAzm1KBdtRZWErpI5lEWTXp5Z/vHpZ3/wyKKwYGGOdAYwR0EZwoezTYApBEIObyELl/aE1/83cp40Pt5mxqCKrE4Ck+mVWKKcI5tA8BLEhRBKJLjez6a7MLq7XZtp+yyOawwCBtkiBVZDKzRk4NN7NQBMYPHiZDFhXY+p9ff7F961vVcnl4R5I2ykJ5XFN7Ab7Gc61VoipNBKF+PDyztu5lfrSLT/wIwCxq0CAGtXHZTzqR2jtwQiXONma6hHpj9sLT7YaPxfTXuZdBGA02Wi7FS48YiTfj+i2NhqtdhP5RC8mh2/Op7y0v6eAcWVLFT8D7kWX5S9mepp+C450MV6aWL1cGnvkxbwHtLW2B9AOkLeUd9KEDuh9fl/7CEj7YH5g+3r/lWfF9In7tPz6T4IIwBJOr1SJyIGQMZQbsh5P9uBq5VJtqHh2mo49pdw5WFoEwKWqWHacaWOjQXWGcifKo6vj5RGS6zykI587XeUIQDqJSmAp+lE4qt19W5P9o8+Lma5DcjsC8JiT607lMVkdqQ0Vyh3lHhmh52tfNy78ajXv0rgYzv8nfwswANuk+7sD/Q0aAAAAAElFTkSuQmCC">
            <style>
                html, body, pre {
                    margin: 0;
                    padding: 0;
                    font-family: Monaco, 'Lucida Console', monospace;
                    background: #ECECEC;
                }
                h1 {
                    margin: 0;
                    background: #AD632A;
                    padding: 20px 45px;
                    color: #fff;
                    text-shadow: 1px 1px 1px rgba(0,0,0,.3);
                    border-bottom: 1px solid #9F5805;
                    font-size: 28px;
                }
                p#detail {
                    margin: 0;
                    padding: 15px 45px;
                    background: #F6A960;
                    border-top: 4px solid #D29052;
                    color: #733512;
                    text-shadow: 1px 1px 1px rgba(255,255,255,.3);
                    font-size: 14px;
                    border-bottom: 1px solid #BA7F5B;
                }
            </style>
        </head>
        <body>
            <h1>Bad Request</h1>
    
            <p id="detail">
                For request 'GET /' [Invalid Json: No content to map due to end-of-input
     at [Source: akka.util.ByteIterator$ByteArrayIterator$$anon$1@5e048149; line: 1, column: 0]]
            </p>
    
        </body>
    </html>
FROM node:lts-alpine

RUN apk add --no-cache curl

WORKDIR /app

COPY . .

RUN npm install

CMD ["npm", "run", "dev", "--", "--host", "0.0.0.0"]

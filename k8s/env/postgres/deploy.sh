#!/usr/bin/env bash

kubectl apply -f postgres.configmap.yml
kubectl apply -f postgres.storage.yml
kubectl apply -f postgres.deployment.yml
kubectl apply -f postgres.service.yml


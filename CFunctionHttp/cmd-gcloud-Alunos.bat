gcloud functions deploy cf-list-group-run-vms --project=cn2324-t1-g15 --region=europe-west2 --allow-unauthenticated --entry-point=functionhttp.Entrypoint --no-gen2 --runtime=java11 --trigger-http --source=target/deployment --service-account=cn-v2324-storage-717@cn2324-t1-g15.iam.gserviceaccount.com